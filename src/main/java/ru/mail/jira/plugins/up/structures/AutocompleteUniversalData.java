/*
 * Created by Dmitry Miroshnichenko 12-02-2013. Copyright Mail.Ru Group 2013.
 * All rights reserved.
 */
package ru.mail.jira.plugins.up.structures;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import net.jcip.annotations.Immutable;


@Immutable
@XmlRootElement
public class AutocompleteUniversalData extends AbstractSQLDataBean
{
    @XmlElement
    private String name;

    @XmlElement
    private String type;

    @XmlElement
    private String typeimage;

    @XmlElement
    private String description;

    @XmlElement
    private String state;

    @XmlElement
    private String stateimage;

    @XmlElement
    private String preference;

    @XmlElement
    private String preferenceimage;

    public AutocompleteUniversalData()
    {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getStateimage()
    {
        return stateimage;
    }

    public void setStateimage(String stateimage)
    {
        this.stateimage = stateimage;
    }

    public String getPreference()
    {
        return preference;
    }

    public void setPreference(String preference)
    {
        this.preference = preference;
    }

    public String getPreferenceimage()
    {
        return preferenceimage;
    }

    public void setPreferenceimage(String preferenceimage)
    {
        this.preferenceimage = preferenceimage;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getTypeimage()
    {
        return typeimage;
    }

    public void setTypeimage(String typeimage)
    {
        this.typeimage = typeimage;
    }
}
