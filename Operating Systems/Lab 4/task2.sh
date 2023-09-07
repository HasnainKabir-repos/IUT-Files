#!/bin/bash

DIR1="Missing_Files"
filenames="filenames.txt"

mkdir $DIR1

while read -r filename; do
	if [ ! -e $filename ]; then
		touch $DIR1/$filename
	fi
done <$filenames
