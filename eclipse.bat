@echo off
call env.bat
set VM=%JAVA_HOME%\bin\javaw.exe
set USER_DIR=%cd%\..\..\conf\eclipse\xxosiclient
cd ..\..\tools\eclipse
eclipse.exe -vm %VM% -data %USER_DIR%
