```aiignore
 Id CommandLine                                                                                                                                                                   
  -- -----------                                                                                                                                                                   
   1 git init                                                                                                                                                                      
   2 git branch -m master main                                                                                                                                                     
   3 git config --global init.defaultBranch main                                                                                                                                   
   4 git checkout dev                                                                                                                                                              
   5 git checkout -b "dev"                                                                                                                                                         
   6 git push -u origin dev                                                                                                                                                        
   7 git checkout -b test                                                                                                                                                          
   8 git branch                                                                                                                                                                    
   9 git checkout dev                                                                                                                                                              
  10 git branch -d test                                                                                                                                                            
  11 git push origin --delete test                                                                                                                                                 
  12 git checkout -b test                                                                                                                                                          
  13 git push -u origin test                                                                                                                                                       
  14 git checkout dev                                                                                                                                                              
  15 git branch -d test                                                                                                                                                            
  16 git push origin --delete test                                                                                                                                                 
  17 PS C:\java\Practice_101> git push origin --delete test                                                                                                                        
  18 error: unable to delete 'test': remote ref does not exist                                                                                                                     
  19 error: failed to push some refs to 'https://github.com/AlianeIsimbi/Practice_101.git'                                                                                         
  20 PS C:\java\Practice_101> git push origin --delete test                                                                                                                        
  21 error: unable to delete 'test': remote ref does not exist                                                                                                                     
  22 git checkout -b ft/setup                                                                                                                                                      
  23 touch test.java                                                                                                                                                               
  24 ni test.java                                                                                                                                                                  
  25 git add test.java                                                                                                                                                             
  26 git add -all                                                                                                                                                                  
  27 git add --all                                                                                                                                                                 
  28 public class TestSetup {...                                                                                                                                                   
  29 git commit -m "feat: Add initial TestSetup class with placeholder logic"                                                                                                      
  30 git stash                                                                                                                                                                     
  31 git stash list                                                                                                                                                                
  32 git push -u origin ft/setup                                                                                                                                                   
  33 git checkout main                                                                                                                                                             
  34 git add .                                                                                                                                                                     
  35 git commit -m "chore: update TestSetup message in main"                                                                                                                       
  36 git push                                                                                                                                                                      
  37  git push origin HEAD                                                                                                                                                         
  38 git checkout ft/setup                                                                                                                                                         
  39 git merge main                                                                                                                                                                
  40 git add .                                                                                                                                                                     
  41 git commit -m "fix: resolve merge conflict with main"                                                                                                                         
  42 Get History | Out-File terminal-history.txt                                                                                                                                   
  43 PS C:\java\Practice_101> Get History | Out-File terminal-history.txt                                                                                                          
  44 Get : The term 'Get' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the spelling of the name, or if a path was included, veri...
  45 the path is correct and try again.                                                                                                                                            
  46 At line:1 char:1                                                                                                                                                              
  47 + Get History | Out-File terminal-history.txt                                                                                                                                 
  48 + ~~~                                                                                                                                                                         
  49     + CategoryInfo          : ObjectNotFound: (Get:String) [], CommandNotFoundException                                                                                       
  50     + FullyQualifiedErrorId : CommandNotFoundException                                                                                                                        
  51 + Get-History | Out-File terminal-history.txt                                                                                                                                 



```