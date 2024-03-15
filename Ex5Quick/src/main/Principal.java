package main;

import controller.ResController;

public class Principal {

	public static void main(String[] args) {
		ResController rc = new ResController();
		int[] vet = {74,20,74,87,81,16,25,99,44,58};
		int[] vet2 = {44,43,42,41,40,39,38};
		int[] vet3 = {31,32,33,34,99,98,97,96};
		rc.Res(vet);
		rc.Res(vet2);
		rc.Res(vet3);
	}

}
