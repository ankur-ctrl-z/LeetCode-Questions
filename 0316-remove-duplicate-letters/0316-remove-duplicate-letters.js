/**
 * @param {string} s
 * @return {string}
 */

var removeDuplicateLetters = function(s) {
    const stack = [];
    
    for (let i = 0; i < s.length; i++) {
        const char = s[i];
        if (stack.includes(char)) continue;
        
        while (stack.length && stack[stack.length - 1] > char && s.slice(i).includes(stack[stack.length - 1])) {
            stack.pop();
        }
        stack.push(char);
    }
    
    return stack.join('');
};