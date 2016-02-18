#!/bin/bash

set -e

chmod +x trile

lein uberjar

mkdir -p $HOME/.trile_scripts

cp target/*standalone.jar $HOME/.trile_scripts/trile.jar

cp resources/* $HOME/.trile_scripts
