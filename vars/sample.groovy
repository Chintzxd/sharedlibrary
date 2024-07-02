def newGit (repo)
{
  git "${repo}"
}
def build ()
{
  sh 'mvn clean install'
}

  
  
