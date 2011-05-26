@echo off & setlocal

set "targetDir=..\..\target"

set "cp=%targetDir%\example-classes"
set "cp=%cp%;%targetDir%\miniconnectionpoolmanager.jar"
set "cp=%cp%;%targetDir%\h2.jar"

java -cp "%cp%" %1