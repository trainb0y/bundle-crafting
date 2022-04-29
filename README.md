# PaperMC Kotlin Template
A blank PaperMC plugin set up to use gradle and the Kotlin programming language.
I'm not sure this uses all best practices, this is mostly for personal use.

### To use:
 - Update `src/main/resources/plugin.yml` to match your plugin's information
 - Rename `net.example.templateplugin` to your package name
 - Rename `PaperKotlinTemplate` to your plugin name, or at least something more reasonable.

To generate a plugin jar run the `shadowJar` gradle task, the output should be in `build/libs/pluginname-all.jar`