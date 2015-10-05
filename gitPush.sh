git init
git add .
git status
git commit -m $1
git remote add origin https://github.com/Krewn/BuildOnL2C.git
git remote -v
git push origin master -f
