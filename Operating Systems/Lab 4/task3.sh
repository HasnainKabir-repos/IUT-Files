#!/bin/bash

dir="../Lab04"

for file in "$dir"/*.sh; do
    timestamp=$(date +"%Y%m%d%H%M%S")
    new_name="${timestamp}_$(basename "$file")"
    mv "$file" "$dir/$new_name"
done

