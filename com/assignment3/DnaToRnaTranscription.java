package com.assignment3;
public class DnaToRnaTranscription {

    public  String transcribeToRna(String dnaSequence) {
        StringBuilder rnaSequence = new StringBuilder();

        for (char nucleotide : dnaSequence.toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rnaSequence.append('C');
                    break;
                case 'C':
                    rnaSequence.append('G');
                    break;
                case 'T':
                    rnaSequence.append('A');
                    break;
                case 'A':
                    rnaSequence.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid DNA nucleotide: " + nucleotide);
            }
        }
        
        return rnaSequence.toString();
    }

    public static void main(String[] args) {
        DnaToRnaTranscription dnaToRnaTranscription = new DnaToRnaTranscription();
        String dnaSequence = "GCTA";
        String rnaSequence = dnaToRnaTranscription.transcribeToRna(dnaSequence);
        System.out.println("DNA: " + dnaSequence);
        System.out.println("RNA: " + rnaSequence);
    }
}
