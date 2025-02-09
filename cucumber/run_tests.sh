#!/bin/bash

# Afficher un message indiquant que les tests sont en cours d'exécution
echo "Running Maven tests..."


mvn clean test


mvn surefire-report:report

echo "Tests completed. See the Surefire report for details."
