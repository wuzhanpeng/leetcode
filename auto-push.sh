#!/bin/bash
git add --all
git commit -m `date "+%Y/%m/%d|%H:%M:%S"`
git push -u origin master
