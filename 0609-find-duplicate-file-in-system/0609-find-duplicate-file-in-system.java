class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        //map where key is content and value is List of files with that content
        Map<String, List<String>> map = new HashMap<>();
        //list containing all the files
        List<String> files = new ArrayList<>();
        
        for(String s : paths){
            String [] strArr = s.split(" ");
            for(int i = 1; i < strArr.length; i++){
                files.add(strArr[0]+"/"+strArr[i]);
            }
        }
        
        for(String s : files){
            int start = s.indexOf("(")+1;
            int end = s.indexOf(")");
            String content = s.substring(start, end);
            // System.out.println(content);
            List<String> temp = map.getOrDefault(content, new ArrayList<>());
            temp.add(s.substring(0,start-1));
            map.put(content, temp);
        }
        
        
        // System.out.println(files);
        // System.out.println(map);
        
        List<List<String>> result = new ArrayList<>();
        System.out.println(map.keySet());
        for(String s: map.keySet()){
            if(map.get(s).size()>1){
                System.out.println(map.get(s)); 
                result.add(map.get(s));
            }
        }

        
        return result;
    }
}