def newGit(repo, branch) {
    checkout([$class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: repo]]
    ])
}

def build() {
    sh 'mvn clean install'
}


  
  
