#!/bin/bash

set -e

chmod +x trile

echo "Building uberjar..."

lein do clean, uberjar

echo "Copying..."

mkdir -p "$HOME/.trile_scripts"

cp target/*standalone.jar "$HOME/.trile_scripts/trile.jar"

cp resources/* "$HOME/.trile_scripts"

echo "Done!"
