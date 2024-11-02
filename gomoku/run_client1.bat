@echo off
echo Starting GoMoKu Client 1 (Alice)...

REM Backup existing clientconfig.xml
if exist clientconfig_backup.xml (
    del clientconfig_backup.xml
)
ren clientconfig.xml clientconfig_backup.xml

REM Copy client1config.xml to clientconfig.xml
copy client1config.xml clientconfig.xml

REM Run the client
java -Xmx256m -cp "target\gomuku-client-1.0-jar-with-dependencies.jar" edu.hitsz.driver.ClientDriver

REM Restore the original clientconfig.xml
del clientconfig.xml
ren clientconfig_backup.xml clientconfig.xml

pause