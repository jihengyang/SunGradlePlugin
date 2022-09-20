plugins {
    id("kotlin")
    id("maven-publish")
}

dependencies {
    implementation(gradleApi())
    implementation("com.android.tools.build:gradle:7.3.0")
}

afterEvaluate {
    publishing {
        repositories {
            maven {
                name = "myrepo"
                url = uri("${project.buildDir}/repo")
            }
        }

        publications {
            create<MavenPublication>("product") {
                from(components["java"])
                groupId = "sun-gradle-plugin" // 请填入你的组件名
                artifactId = "test" // 请填入你的工件名
                version = "1.0" // 请填入工件的版本名
//                artifact(tasks["sourcesJar"]) // 打包源码到工件中
            }
        }
    }
}