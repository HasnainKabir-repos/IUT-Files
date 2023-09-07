#!/bin/bash

dir="../"
report_file="report.txt"

> "$report_file"

check_permissions() {
    local file="$1"
    local permissions=$(stat -c %a "$file")

    if [[ "$permissions" == "777" || "$permissions" == "666" ]]; then
        echo "Insecure permissions found: $file - Permissions: $permissions" >> "$report_file"
    fi
}

find "$dir" -type f -exec bash -c 'check_permissions "$0"' {} \;

if [ -s "$report_file" ]; then
    echo "Insecure permissions found. See the report in '$report_file'."
else
    echo "No insecure permissions found in the directory."
fi

