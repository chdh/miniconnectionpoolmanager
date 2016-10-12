@echo off & setlocal

set "targetDir=..\..\target"
set "javaParms="

set "cp=%targetDir%\example-classes"
set "cp=%cp%;%targetDir%\miniconnectionpoolmanager.jar"

rem for H2:
   set "cp=%cp%;%targetDir%\h2.jar"

rem for MS SQL Server:
   rem set "cp=%cp%;%targetDir%\sqljdbc4.jar"
   rem set "javaParms=%javaParms% -DsaPassword=%sqlServerSaPassword%"

rem for SQLite:
   rem set "cp=%cp%;%targetDir%\sqlite-jdbc-3.14.2.1.jar"

java -cp "%cp%" %javaParms% %1
