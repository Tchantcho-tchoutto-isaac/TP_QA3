@echo off

echo Running Maven tests...

:: Exécuter les tests Maven
mvn test

:: Générer le  rapport Surefire
mvn surefire-report:report
pause
