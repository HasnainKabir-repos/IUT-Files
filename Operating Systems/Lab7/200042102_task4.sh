#!/bin/bash

dir="$1"
days="$2"

find "$dir" -type f -mtime "-$days" -ls
