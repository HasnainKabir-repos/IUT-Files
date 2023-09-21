#!/bin/bash

dir="$1"

find "$dir" -type f -name "*.txt" -exec grep -q -v '[^[:space:]]' {} \; -exec sed -i'' -e '/^[[:space:]]*$/d' {} \;