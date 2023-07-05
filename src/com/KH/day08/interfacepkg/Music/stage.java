package com.KH.day08.interfacepkg.Music;

public class stage {
public static void main(String[] args) {
	Musician musician = new Musician ();
	musician.play(new drum());
	musician.play(new guitar());
	musician.play(new Piano());
}
}
