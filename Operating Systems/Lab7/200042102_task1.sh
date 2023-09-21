#!/bin/bash

dir="$1"

find "$dir" -type f | sed -n 's/.*\.\([^.]*\)$/\1/p' | sort | uniq -c | while read -r count ext; do
    echo "File Type: $ext Count: $count"
done