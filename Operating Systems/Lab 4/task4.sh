#!/bin/bash

read -p "Enter directory name: " dir_name
mkdir -p "$dir_name"

function create_structure() {
    local current_dir="$dir_name"
    read -p "Enter subdirectory names for '$current_dir' (comma-separated): " subdirs
    for subdir in $(echo "$subdirs" | tr ',' ' '); do
        mkdir -p "$current_dir/$subdir"
        create_structure "$current_dir/$subdir"
    done
}

create_structure "$dir_name"

read -p "Enter file name: " file
touch "$dir_name/$file"
