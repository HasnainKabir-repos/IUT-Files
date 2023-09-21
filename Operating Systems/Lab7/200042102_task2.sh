#!/bin/bash

dir="$1"

mkdir "$dir/recent"
mkdir "$dir/within30"
mkdir "$dir/within90"
mkdir "$dir/older"

sort_files() {
    file="$1"
    now=$(date +%s)
    mtime=$(stat -c %Y "$dir")
    diff=$(( (now - mtime) / (24 * 3600) ))

    if [ diff -le 7 ]; then
        mv "$file" "$dir/recent/"
    elif [ diff -le 30 ]; then
        mv "$file" "$dir/within30/"
    elif [ diff -le 90 ]; then
        mv "$file" "$dir/within90/"
    else
        mv "$file" "$dir/older/"
    fi 

}

export -f sort_files

find "$dir" -type f -exec bash -c 'sort_files "$0"' {} \;