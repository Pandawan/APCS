#!/bin/sh

LOG_DIR="./"    # Create this dir or use another one

dir=$(echo $1|tr -d '\r\n')

echo $dir

if [[ $dir ]]; then
	dir="."
fi

for java_file in `ls $dir/*.java`;
do
    javac -g $java_file
    return_status=`echo $?`
    if [ $return_status -ne 0 ]
    then
        echo "Failed to compile $java_file" >> $LOG_DIR/$java_file.ERR

        exit 1
    fi
done

fileToRun=$(ls *Tester.class)
b=${fileToRun%.*}

java $b