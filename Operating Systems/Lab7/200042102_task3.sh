#!/bin/bash

dir="$1"
search_text="$2"
replace_text="$3"

find "$dir" -type f -exec sed -i "s/$search_text/$replace_text/g" {} \;