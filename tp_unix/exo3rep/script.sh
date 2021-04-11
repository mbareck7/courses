#!/bin/bash
for rep in $(ls);do touch `pwd`/$rep/file{1..7};done