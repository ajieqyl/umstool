/**
 * 
 */
package com.telenav.user.tool.service;


/**
 * @author [Liu Jie]
 *
 * $LastChangedDate$
 * $LastChangedRevision$
 * $LastChangedBy$
 */
public interface UserSearchService {

    public UserSearchResult searchUser(String key);
    
    public String lookUpUserKey(String fieldType,String field);
}
