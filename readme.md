
## Publish to Nexus Maven Repositories ##

~/.m2/settings.xml

    <settings>
        <servers>
            <server>
                <id>teamcollab</id>
                <username>USERNAME</username>
                <password>PASSWORD</password>
            </server>
        </servers>
    </settings>

in pom.xml

    <distributionManagement>
        <repository>
            <id>teamcollab</id>
            <url>http://nexus.teamcollab.org/content/repositories/releases/</url>
        </repository>
        <snapshotRepository>
            <id>teamcollab</id>
            <url>http://nexus.teamcollab.org/content/repositories/snapshots/</url>
        </snapshotRepository>
    </distributionManagement>
