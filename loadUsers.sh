#!/bin/bash

while read -r person; do

  echo $person | jq '.'

done < <(jq -c '.results[] | {firstName: .name.first, lastName: .name.last, countryCode: }' $1)