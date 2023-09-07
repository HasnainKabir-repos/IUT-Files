#!/bin/bash

source_directory="../"

destination_directory="./dest"

mkdir -p "$destination_directory"

extension_file="extensions.txt"

if [ -e "$extension_file" ]; then
    
    while read -r extension; do
       
        extension_directory="$destination_directory/${extension#*.}"
        mkdir -p "$extension_directory"
        
        find "$source_directory" -type f -iname "*.$extension" -exec mv {} "$extension_directory" \;
    done < "$extension_file"

    echo "Files have been sorted into subdirectories based on their extensions."
else
    echo "Extension file '$extension_file' not found."
fi

