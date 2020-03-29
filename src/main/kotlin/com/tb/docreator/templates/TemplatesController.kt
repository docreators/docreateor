package com.tb.docreator.templates

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/templates")
class TemplatesController {

    @GetMapping
    fun getTemplates(): TemplateName {
        return TemplateName("Template name")
    }

}

data class TemplateName(var name: String)
