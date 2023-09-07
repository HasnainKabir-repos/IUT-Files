#!/bin/bash

source_directory="../"

large_files_directory="./large"

size_threshold=1048576  # 1 MB 
mkdir -p "$large_files_directory"

find "$source_directory" -type f -size +${size_threshold}c -exec mv {} "$large_files_directory" \;

echo "Large files have been moved to '$large_files_directory'."

