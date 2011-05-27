@echo off & setlocal

set "targetDir=..\..\target"
set "javaParms="

set "cp=%targetDir%\example-classes"
set "cp=%cp%;%targetDir%\miniconnectionpoolmanager.jar"

rem for H2:
   set "cp=%cp%;%targetDir%\h2.jar"

rem for MS SQL Server:
   set "cp=%cp%;%targetDir%\sqljdbc4.jar"
   set "javaParms=%javaParms% -DsaPassword=%sqlServerSaPassword%"

java -cp "%cp%" %javaParms% %1