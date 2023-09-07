#!/bin/bash

read -p "Enter the directory path: " directory

if [ ! -d "$directory" ]; then
    echo "Directory not found."
    exit 1
fi

total_size=$(du -sh "$directory" | cut -f1)

echo "Total size of '$directory': $total_size"

