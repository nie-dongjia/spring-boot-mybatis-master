@echo off
echo "start install"
call mvn clean install -Dmaven.test.skip=true  
echo "install success"
cmd