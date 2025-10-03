// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "Building the code"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
