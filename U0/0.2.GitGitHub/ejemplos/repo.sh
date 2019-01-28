#!/bin/bash

rm -f *.txt 

rm -rf .git
git init
echo "asdf" > a.txt
git add -A
git commit -m "init"
echo "1234" >> a.txt
git commit -am "Añado 1234"

git checkout -b rama
echo "hola" >> a.txt
echo "Contenido de b" > b.txt
git add -A 
git commit -am "b nuevo y saludo en a"

git checkout master
echo "...">>a.txt
git commit -am "puntos suspensivos"

echo "adios" >> a.txt
git commit -am "despedida"




git log --graph --all --oneline
