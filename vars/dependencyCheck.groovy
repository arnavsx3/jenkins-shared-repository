def call(String installation) {
    dependencyCheck(
        additionalArguments: '--scan ./',
        odcInstallation: installation
    )
    
    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
