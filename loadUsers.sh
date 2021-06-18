#!/bin/bash

while read -r person; do

  countryName=$(echo $person | jq -r '.country')

  # look up country code from rescountires
  code=$(curl -s https://restcountries.eu/rest/v2/name/${countryName} | jq -r '.[0].alpha2Code')
  echo $code
  # Insert country code into person payload
  person=$(echo "$person" | jq -c --arg code $code '.countryCode=$code')

  # Send payload into facade post API
  curl -s -XPOST -H "Content-Type: application/json" -d ${person} http://localhost:30000/v1/people

done < <(jq -c '.results[] | {firstName: .name.first, lastName: .name.last, country: .location.country, dateOfBirth: .dob.date, countryCode: null} ' $1)