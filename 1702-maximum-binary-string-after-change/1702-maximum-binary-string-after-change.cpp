class Solution {
public:
    string maximumBinaryString(string binary) {
        int count=0,findex=0;
        for(int i=binary.size()-1;i>=0;i--){
            if(binary[i] == '0'){
                count++;
                findex = i;
            }
            binary[i] = '1';
        }
        if(!count){
            return binary;
        }
        binary[findex + count-1] = '0';
        return binary;
    }
};