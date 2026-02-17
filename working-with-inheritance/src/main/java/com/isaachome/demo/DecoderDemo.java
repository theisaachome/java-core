

class StringDigitExtractor{
    private String input;

    public StringDigitExtractor(String input) {
        this.input = input;
    }
    List<Integer> extractDigits() {
        var list = new ArrayList<Integer>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='0'&&input.charAt(i)<='9'){
                list.add(Integer.parseInt(String.valueOf(input.charAt(i))));
            }
        }
        return list;
    }
}
 class DecoderDemo {
    Integer decode(List<String> input){
        int total=0;
        for(String str:input){
            var digits = new StringDigitExtractor(str).extractDigits();
             var sum = digits.stream().collect(Collectors.summingInt(i->i));
             total += sum;
        }
        return total;
    }
}

void main() {
    var result=new DecoderDemo().decode(List.of("abc","12234567"));
    System.out.println("Decoded value: " +result);
}
