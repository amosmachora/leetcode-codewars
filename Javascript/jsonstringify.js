/**
 * @param {any} object
 * @return {string}
 */
 var jsonStringify = function(object) {
    if(object === null || object === undefined){
        return object;
    }
    const keys = Object.keys(object);
    const values = Object.values(object);

    let stringifiedObject = ""

    for(let i = 0; i < keys.length ; i++) {
        const isLastKey = i === keys.length - 1;
        const currentKey = keys[i];
        let currentValue = values[i];

        if(typeof currentValue === 'string') {
            currentValue = `"${currentValue}"`;
        }
        
        if(Array.isArray(currentValue)){
            const arrayValues = [];
           for(let j = 0; j < currentValue.length; j++){
               arrayValues.push(jsonStringify(currentValue[j]));
               currentValue = `[${arrayValues.join(',')}]`
           }
        } else if(typeof currentValue === 'object'){
            currentValue = jsonStringify(currentValue); 
        }

        let prop = `"${currentKey}":${currentValue}${isLastKey ? '' : ','}`;
        stringifiedObject += prop; 
    }

    return `{${stringifiedObject}}`;
};