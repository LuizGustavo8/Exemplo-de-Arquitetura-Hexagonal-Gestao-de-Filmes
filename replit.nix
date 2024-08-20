{ pkgs }: {
	deps = [
   pkgs.sqlite
   pkgs.imagemagick6Big
		pkgs.graalvm17-ce
		pkgs.maven
		pkgs.replitPackages.jdt-language-server
		pkgs.replitPackages.java-debug
	];
}