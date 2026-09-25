def call(String installation) {

    dependencyCheck(
        additionalArguments: """
            --scan .
            --format XML
            --format HTML
            --nvdDatafeed https://dependency-check.github.io/DependencyCheck_Builder/nvd_cache/nvdcve-{0}.json.gz
        """,
        odcInstallation: installation
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
