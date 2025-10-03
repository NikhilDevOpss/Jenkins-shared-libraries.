def clone(String GitUrl, String GitBranch){
  echo "Cloning The code"
  git url: "${GitUrl}", branch: ${GitBranch}"
  echo "Cloned successfully"
}
