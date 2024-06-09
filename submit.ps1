$t = Get-Date -Format "dddd MM/dd/yyyy HH:mm K"
echo "✨ Update: $t"
git add .
git commit -m "✨ Update: $t"
git push