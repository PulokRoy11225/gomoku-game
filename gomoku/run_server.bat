@echo off
echo Starting GoMoKu Server...
java -Xmx512m -cp "target\gomuku-server-1.0-jar-with-dependencies.jar" edu.hitsz.driver.ServerDriver
pause