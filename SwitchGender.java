void main(){
    char gender = 'm';
    String genString;
    switch(gender){
        case 'M','m': genString = "Male";
            break;
        case 'F','f': genString = "FeMale";
            break;
        case 'L','l': genString = "LGBTQ+";
            break;
        default: genString = "Please Type M , F OR LG";
            break;
    }
    IO.print(genString);
}