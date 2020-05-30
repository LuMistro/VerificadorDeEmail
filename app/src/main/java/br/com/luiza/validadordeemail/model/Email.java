package br.com.luiza.validadordeemail.model;

import androidx.annotation.NonNull;

public class Email {

    private String email_address;
    private String domain;
    private String is_free;
    private String is_syntax;
    private String is_domain;
    private String is_smtp;
    private String is_verified;
    private String is_server_down;
    private String is_greylisted;
    private String is_disposable;
    private String is_suppressed;
    private String is_role;
    private String is_high_risk;
    private String is_catchall;
    private String mailboxvalidator_score;
    private String time_taken;
    private String status;
    private String credits_available;
    private String error_code;
    private String error_message;

    public Email() {
    }

    public Email(String email_address, String domain, String is_free, String is_syntax, String is_domain, String is_smtp, String is_verified, String is_server_down, String is_greylisted, String is_disposable, String is_suppressed, String is_role, String is_high_risk, String is_catchall, String mailboxvalidator_score, String time_taken, String status, String credits_available, String error_code, String error_message) {
        this.email_address = email_address;
        this.domain = domain;
        this.is_free = is_free;
        this.is_syntax = is_syntax;
        this.is_domain = is_domain;
        this.is_smtp = is_smtp;
        this.is_verified = is_verified;
        this.is_server_down = is_server_down;
        this.is_greylisted = is_greylisted;
        this.is_disposable = is_disposable;
        this.is_suppressed = is_suppressed;
        this.is_role = is_role;
        this.is_high_risk = is_high_risk;
        this.is_catchall = is_catchall;
        this.mailboxvalidator_score = mailboxvalidator_score;
        this.time_taken = time_taken;
        this.status = status;
        this.credits_available = credits_available;
        this.error_code = error_code;
        this.error_message = error_message;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIs_free() {
        return is_free;
    }

    public void setIs_free(String is_free) {
        this.is_free = is_free;
    }

    public String getIs_syntax() {
        return is_syntax;
    }

    public void setIs_syntax(String is_syntax) {
        this.is_syntax = is_syntax;
    }

    public String getIs_domain() {
        return is_domain;
    }

    public void setIs_domain(String is_domain) {
        this.is_domain = is_domain;
    }

    public String getIs_smtp() {
        return is_smtp;
    }

    public void setIs_smtp(String is_smtp) {
        this.is_smtp = is_smtp;
    }

    public String getIs_verified() {
        return is_verified;
    }

    public void setIs_verified(String is_verified) {
        this.is_verified = is_verified;
    }

    public String getIs_server_down() {
        return is_server_down;
    }

    public void setIs_server_down(String is_server_down) {
        this.is_server_down = is_server_down;
    }

    public String getIs_greylisted() {
        return is_greylisted;
    }

    public void setIs_greylisted(String is_greylisted) {
        this.is_greylisted = is_greylisted;
    }

    public String getIs_disposable() {
        return is_disposable;
    }

    public void setIs_disposable(String is_disposable) {
        this.is_disposable = is_disposable;
    }

    public String getIs_suppressed() {
        return is_suppressed;
    }

    public void setIs_suppressed(String is_suppressed) {
        this.is_suppressed = is_suppressed;
    }

    public String getIs_role() {
        return is_role;
    }

    public void setIs_role(String is_role) {
        this.is_role = is_role;
    }

    public String getIs_high_risk() {
        return is_high_risk;
    }

    public void setIs_high_risk(String is_high_risk) {
        this.is_high_risk = is_high_risk;
    }

    public String getIs_catchall() {
        return is_catchall;
    }

    public void setIs_catchall(String is_catchall) {
        this.is_catchall = is_catchall;
    }

    public String getMailboxvalidator_score() {
        return mailboxvalidator_score;
    }

    public void setMailboxvalidator_score(String mailboxvalidator_score) {
        this.mailboxvalidator_score = mailboxvalidator_score;
    }

    public String getTime_taken() {
        return time_taken;
    }

    public void setTime_taken(String time_taken) {
        this.time_taken = time_taken;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCredits_available() {
        return credits_available;
    }

    public void setCredits_available(String credits_available) {
        this.credits_available = credits_available;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }
}



